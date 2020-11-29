package com.design.patterns.decorator;

public class ConcreteComponent extends Component {

	@Override
	void openURL() {
		System.out.println("open web page in browser");
	}

}
