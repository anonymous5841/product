
public class Product_test {


        public static void main(String[] args) {
            // Date d1=new Date(17,9,2023);
            product p1=new product("Keyboard", 500, 3,new Date(17,9,2023));
            System.out.println(p1.getMfcDate());

            System.out.println(p1.getMfcDate());
            product p2=new product("LCD",20000, 3,new Date(1,1,1));


            product temp=p1.getLatest(p1,p2);
            System.out.println(temp);

            //product p3=new product("Laptop",50000,4);
//
////        System.out.println(p1.toString());
////        System.out.println(p2);
////        System.out.println(p3);
//
//  //      product temp=new product(p1.getName(),p1.getPrice(),p1.getQuantity());
//        product temp=p1.clone();
//
//        System.out.println(p1);
//        System.out.println(temp);
//        temp.setName("connector");
//        int x=10;
//        System.out.println();
//        System.out.println(p1);
//        System.out.println(temp);
        }

}
