class Boolean {
    
    int x,y;
    Boolean(int x, int y ){

        this.x=x;
        this.y=y;
    }
    boolean equalsto (Boolean t){
        if(this.x==x && this.y==y){
            return true;
        }else{
            return false;
        }
    }
}
class Main{


    public static void main(String [] args){

        Boolean t1 = new Boolean(5, 6);
        Boolean t2 = new Boolean(5, 6);

        System.out.println(t2.equalsto(t1));
    }
}
