
public class CollectiuonOfLotionIterator implements Container {

	String lotions[] = { "Beardo Ultraglow All in 1 Men's Face Lotion", "Sebamed Baby Lotion", "Ponds Triple Vitamin Moisturising Body Lotion"  };

	@Override
	public Iterator getIterator() {

		return new LotionIterator();
	}

	private class LotionIterator implements Iterator {
		int i;

		
		@Override
		public Object next() {
			if (this.hasNext()) {
				return lotions[i++];
			}
			return null;
		}
		
		@Override
		public boolean hasNext() {
			if (i < lotions.length) {
				return true;
			}
			return false;
		}

		
	}

}
