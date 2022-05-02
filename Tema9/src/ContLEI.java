
public class ContLEI extends ContBancar {

	public ContLEI(String numarCont, float suma) {
		super(numarCont, suma);

	}

	public void transfer(ContLEI contDestinatie, float suma) {
		if (this.removeSuma(suma))
			contDestinatie.addSuma(suma);
	}

	private void addSuma(float suma) {
		// TODO Auto-generated method stub

	}

	private boolean removeSuma(float suma) {
		// TODO Auto-generated method stub
		return false;
	}

	public float getSumaTotala() {
		return this.getSuma();
	}

}
