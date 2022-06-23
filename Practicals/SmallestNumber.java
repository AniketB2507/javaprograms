class SmallestNumber
{
public static void main(String args[]){
int x = 120;
int y = 135;
int z = 127;
int smallest;
smallest = (x<y)?(x<z?x:z):(y<z?y:z);
System.out.print(smallest);
}
}