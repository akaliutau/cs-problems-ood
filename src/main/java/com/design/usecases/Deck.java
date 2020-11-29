package com.design.usecases;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Deck {
	
	enum Suite {
		HEART,
		CLUBS,
		DIAMOND,
		SPADE
	}
	
	static class Card {
		final int value;
		final Suite suite;
		
		public Card(int value, Suite type) {
			this.value = value;
			this.suite = type;
		}
	}
	
	interface GenericDeck {
		void init();
		boolean hasNext();
		boolean returned(Card card);
		void returnBack(Card card);
		Card getCard();
	}
	
	class DeckImpl implements GenericDeck{
		
		final int totalCards = 52;
		
		int[] haveCards = new int[totalCards];
		int card = 0;
		Suite[] typesMap = {Suite.CLUBS, Suite.DIAMOND, Suite.HEART, Suite.SPADE};
		Set<Card> ret = new HashSet<>();

		private int pos;
		
		
		private void swap(int[] haveCards, int i, int j) {
			int temp = haveCards[i];
			haveCards[i] = haveCards[j];
			haveCards[j] = temp;
		}
		

		/**
		 * [0,1,2,3,4]
		 * [3,1,2,0,4]
		 * [3,0,2,1,4]
		 * [3,0,2,4,1]
		 */
		@Override
		public void init() {
			for (int i = 0; i < totalCards; i++) {
				Random rnd = new Random();
				int j = rnd.nextInt(totalCards - i - 1);//[0,leftLength]
				swap(haveCards, i, i + j);
			}
			this.pos = 0;
			ret.clear();
		}

		@Override
		public boolean hasNext() {
			return card < totalCards;
		}

		@Override
		public Card getCard() {
			int card = haveCards[pos];
			return new Card(card % 13, typesMap[card / 13]);
		}

		@Override
		public boolean returned(Card card) {
			return ret.contains(card);
		}

		@Override
		public void returnBack(Card card) {
			ret.add(card);
		}
		
	}
	
	

}
