package com.tjoeun.genericTest3;

//	<M extends 클래스>
//	implements로 구현해도 제네릭은 extends로 써서 상속받는다.
public class GenericPrinter<M extends Material> { // <M, S, E> 

	
	private M material;

	
	public M getMaterial() {
		return material;
	}
	public void setMaterial(M material) {
		this.material = material;
	}
	
	
}
