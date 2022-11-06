package com.smart.work.code;

public class TiffinBox {

	private String type;
	private String shape;
	private int boxes;
	public String getType() {
		return type;
	}
 void setType(String type) {
		this.type = type;
	}
	public String getShape() {
		return shape;
	}
	 void setShape(String shape) {
		this.shape = shape;
	}
	public int getBoxes() {
		return boxes;
	}
 void setBoxes(int boxes) {
		this.boxes = boxes;
	}
 public void print()
 {
	 System.out.println(this.type);
	 System.out.println(this.boxes);
	 System.out.println(this.shape);
 }
	
}
