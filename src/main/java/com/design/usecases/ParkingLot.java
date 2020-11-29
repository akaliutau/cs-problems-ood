package com.design.usecases;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	
	static enum VehicleType {
		CAR(1),
		BUS(2),
		TRUCK(3);
		
		int size;
		private VehicleType(int size) {
			this.size = size;
		}

	};
		
	static final int ROW_SIZE = 100;
	static final int LEVEL_SIZE = 10;
	static final int PARKING_SIZE = 3;
	
	abstract class Vehicle{
		String id;
		VehicleType type;
	}
	
	class Car extends Vehicle {
		
		public Car(String id) {
			this.id = id;
			type = VehicleType.CAR;
		}
		
	}
	
	class Row {
		int space = ROW_SIZE;
		boolean[] spots = new boolean[ROW_SIZE];
		
		public boolean getSpot(int i, int size) {
			for (int j = i; j < i + size; j++) {
				if (spots[j]) {
					return false;
				}
			}
			Arrays.fill(spots, i, i + size, true);
			return true;
		}
	}
	
	class Level {
		Row[] rows;
		public Level() {
			rows = new Row[LEVEL_SIZE];
			Arrays.fill(rows, new Row());
		}
	}
	
	class Ticket {
		Level level;
		Row row;
		int spot;
		Vehicle vehicle;
		
		public Ticket(Level level, Row row, int spot, Vehicle vehicle) {
			this.level = level;
			this.row = row;
			this.spot = spot;
			this.vehicle = vehicle;
		}
	}

	
	// root parking lot structure
	private Level[] levels;
	// for fast access to vehicle
	private Map<String,Ticket> tickets = new HashMap<>();
	
	public ParkingLot() {
		levels = new Level[PARKING_SIZE];
		Arrays.fill(levels, new Level());
	}
	
	
	public Ticket allocate(String id, Vehicle vehicle) {
		for (Level level : levels) {
			for (Row row : level.rows) {
				for (int i = 0; i < ROW_SIZE - vehicle.type.size; i++) {
					if (row.getSpot(i, vehicle.type.size)) {
						return tickets.put(id, new Ticket(level, row, i, vehicle));
					}
				}
			}
		}
		return null;
	}
	
	public boolean deallocate(Ticket t) {
		Row row = t.row;
		Arrays.fill(row.spots, t.spot, t.spot + t.vehicle.type.size, false);
		tickets.remove(t.vehicle.id);
		return true;
	}
	


}
