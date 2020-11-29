package com.design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import static com.design.patterns.flyweight.ShapeType.*;

public class ShapeFactory {
	static private Map<ShapeType, Shape> shapes = new HashMap<>();

	static {
		shapes.put(OVAL, new Oval());
		shapes.put(LINE, new Line());
	}

	public Shape get(ShapeType shapeType) {
		return shapes.get(shapeType);
	}
}
