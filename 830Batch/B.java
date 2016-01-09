class B
{
public static void main(String args[]){
int x = 100;
int y = x;
//String a = new String("Hello HOW are You");
//String b = new String("Hello How are You");
String a = "Hello How are You";
String b = "Hello How are You";
if(a==b){
System.out.println("Same Reference ");
}
else{
System.out.println("Not Same Reference ");
}
if(a.equalsIgnoreCase(b)){
System.out.println("Same Value ");
}
else{
System.out.println("Not Same Value ");
}


}
}