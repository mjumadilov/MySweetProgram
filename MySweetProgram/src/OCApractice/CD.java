package OCApractice;

public class CD {
	int r;

	CD(int r) {

	this.r = r;

	}

	}

	class DVD extends CD {

	int c;

	DVD(int r, int c) {

	//line n1
		super(r);

		this.c = c;
	}

	}