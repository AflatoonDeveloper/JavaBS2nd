class Box {
   
    String color,material,shape;
    float width,hight,depth;
    Box(float width, float hight, float depth ){

        this.width =width;
        this.hight= hight;
        this.depth=depth;
    }

    Box(String color, String material, String shape){

        this.color=color;
        this.material=material;
        this.shape=shape;
    }

void display(){
    System.out.println(" the volumn : "+ width*depth*hight);
}

void peratical(){

    System.out.println("the color : " + color +"\n the material is :" + material + " \n the shape is :" + shape);
}
}
/**
 * InnerBox
 */
public class InnerBox {
    public static void main(String[]arges){

Box b = new Box(22, 33, 34);
Box info = new Box( "Black", "Plastic", "Box");

info.peratical();
b.display();
    }
    
}

