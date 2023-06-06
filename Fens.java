class Fens{
    String type;
    String company;
    int rpm;
}
  class My{
    public static void main(String arr[]) 
    {
        Fens ob1 = new Fens();

        ob1.type ="Table";
        ob1.company ="Indo";
        ob1.rpm =300;

        Fens ob2 = new Fens();

        ob2.type ="Wall";
        ob2.company ="Bjaj";
        ob2.rpm =700;

        Fens ob3 = new Fens();
        ob3.type ="Roof";
        ob3.company ="Harsha";
        ob3.rpm =100;
         System.out.println(ob1.type + " " + ob1.company+ " " + ob1.rpm);
         System.out.println(ob2.type + " " + ob2.company+ " " + ob2.rpm);
         System.out.println(ob3.type + " " + ob3.company+ " " + ob3.rpm);

    }

}