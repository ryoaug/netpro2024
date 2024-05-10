class ClassCSub extends ClassC {

    ClassCSub(){

        System.out.println("constractor ClassCSub");
    }
    public int getValue(){
		return super.getValue();
	}

    public String getName(){
		return super.getName();
	}


}
