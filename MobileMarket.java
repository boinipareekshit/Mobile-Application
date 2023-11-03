package projects;
import java.util.Scanner;

class mobileBrands{
	int s23=10, s23fe=10,zflip5=10,zfold5=10,a34=10, m34=10,f21=10;
	int o11q=10,o11rq=10,on3q=10,o10proq=10;
	int a13q=10,a14q=10,a15q=10,a15proq=10;
	int opN3q=10,op10renoq=10,opa79q=10,opN2q=10;
	int Np1q=10,Np2q=10;
	int sum;
	int gsttotal;
	int qsams23;
	int qsams23fe;
	int qsamszflip5;
	int qsamszfold5;
	Scanner sc=new Scanner(System.in);
	public int bill(int res) {
		sum+=res;
		return 0;
		
	}
	
		
	public void partten() {
		int s=1;
		for(int i=1;i<=3;i++) {
			for( s=i;s<3;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) { 
				if(i==1)
				System.out.print(" D ");
				else if(i==2&&j==1)
					System.out.print("y  ");
				else if(i==2&&j==2)
					System.out.print(" R ");
				else if(i==3&&j==1)
					System.out.print("H  ");
				else if(i==3&&j==2)
					System.out.print("   A ");
			}
			System.out.println(" ");
		}
	}
	public void gstbill(double result) {
		double gst=result*(18/100.0);
		System.out.println();
		System.out.println("your total bill after discount is "+result);
		result=result+gst;
		System.out.println();
		System.out.println("you are total bill with gst is "+result);
	}
	
	public double discountbill(int total) {
		double totald=total;
		double total_dis_bill;
		if(total>=150000) {
			System.out.println("you have a discount of 10%");
			double dis_price=total*(10/100.0);
			total_dis_bill=total-dis_price;
			return total_dis_bill;
		}
		else if(total>125000&&total<=150000)
		{
			System.out.println("would you like to add more items if yes press 1 if no press 2");
			int dec=sc.nextInt();
			switch(dec) {
			case 1:
				mobiles();
			case 2:
				return totald;
			}
		}
		else {
			return totald;
		}
		return 0.0;
		
	}
	
	
	public int mobiles() {
		
		System.out.println("1. Samsung\n2. Iphone\n3. OnePlus\n4. Oppo\n5. Nothing\n6. Exit()");
//		System.out.println("7. Vivo\n8. google\n9. Mi\n10. Nokia");
		System.out.println("enter a brand name which u want to buy .");
		int mobilebrand=sc.nextInt();
		return mobilebrand;
	}
	public void Samsung(){
		
		
		
		System.out.println("\nsno. Brand    models   prices    quantity\n"
				+ "1.  Samsung   S23      1,00,000   "+(s23>0?s23:"Out of stock")+"\n"
				+ "2.  Samsung   S23FE    60,000     "+(s23fe>0?s23fe:"Out of stock")+"\n"
				+ "3.  Samsung   z Flip5  1,00,000   "+(zflip5>0?zflip5:"Out of stock")+"\n"
				 +"4.  Samsung   z Fold5  90,000     "+(zfold5>0?zfold5:"Out of stock")+"\n"
				 +"5. Exit()s");
//				 System.out.println("5.  Samsung   A34      30,000     "+a34+"\n"
//				+ "6.  Samsung   M34      20,000     "+m34+"\n"
//				+ "7.  Samsung   F21      15,000     "+f21);
		System.out.println("Select a model which you want to buy in Samsung ");
		int samsungmodels=sc.nextInt();
		switch(samsungmodels) {
		case 1:
			System.out.println("enter the number of quantity  ");
			qsams23=sc.nextInt();
			if(qsams23<=s23) {
				s23=s23-qsams23;
				int res=qsams23*100000;
				bill(res);
			
			}
			else if(s23<=0) {
				System.out.println("out of stock");
				Samsung();
			}
			else {
			
				System.out.println("we dont have that much of limit we have only "+s23);
				Samsung();
			}
			break;
		case 2:
			System.out.println("enter the number of quantity  ");
			 qsams23fe=sc.nextInt();
			if(qsams23fe<=s23fe) {
				s23fe=s23fe-qsams23fe;
				int res=qsams23fe*60000;
				bill(res);
			}
			else {
			
				System.out.println("we dont have that much of limit we have only "+s23fe);
				Samsung();
			}
			break;
		case 3:
			System.out.println("enter the number of quantity  ");
			 qsamszflip5=sc.nextInt();
			if(qsamszflip5<=zflip5) {
				zflip5=zflip5-qsamszflip5;
				int res=qsamszflip5*100000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+zflip5);
				Samsung();
			}
			break;
		case 4:
			System.out.println("enter the number of quantity  ");
			qsamszfold5=sc.nextInt();
			if(qsamszfold5<=zfold5) {
				zfold5=zfold5-qsamszfold5;
				int res=qsamszfold5*90000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+zfold5);
				Samsung();
			}
			break;
		case 5:
			mobiles();
			break;
			
			
			
		}
	}
	public void onePlus(){
		 
		System.out.println("\nsno. Brand    models    prices   quantity\n1.   onePlus   11       60,000     "+(o11q>0?o11q:"Out of stock")+"\n2.   onePlus   11R      44,000     "+(o11rq>0?o11rq:"Out of stock")+""
				+ "\n3.   onePlus   Nord 3   30,000     "+(on3q>0?on3q:"Out of stock")+"\n4.   onePlus   10 pro   52,000     "+(o10proq>0?o10proq:"Out of stock")+"\n5.   Exit()");
		System.out.println("Select a model which you want to buy in One plus ");
		int onePlusmodels=sc.nextInt(); 
		switch(onePlusmodels) {
		case 1:
			System.out.println("enter the number of quantity  ");
			int one11qu=sc.nextInt();
			if(one11qu<=o11q) {
				o11q=o11q-one11qu;
				int res=one11qu*60000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+o11q);
				onePlus();
			}
			break;
		case 2:
			System.out.println("enter the number of quantity  ");
			int one11rqu=sc.nextInt();
			if(one11rqu<=o11rq) {
				o11rq=o11rq-one11rqu;
				int res=one11rqu*44000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+o11rq);
				onePlus();
			}
			break;
		case 3:
			System.out.println("enter the number of quantity  ");
			int onen3qu=sc.nextInt();
			if(onen3qu<=on3q) {
				on3q=on3q-onen3qu;
				int res=onen3qu*30000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+on3q);
				onePlus();
			}
			break;
		case 4:
			System.out.println("enter the number of quantity  ");
			int one10proqu=sc.nextInt();
			if(one10proqu<=o10proq) {
				o10proq=o10proq-one10proqu;
				int res=one10proqu*30000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+o10proq);
				onePlus();
			}
			break;
		case 5:
			mobiles();
			break;
		}
	}
	public void iphone(){
		
		System.out.println("\nsno. Brand    models   prices   quantity\n1.   Iphone   13       50,000     "+(a13q>0?a13q:"Out of stock")+"\n2.   Iphone   14       60,000     "+(a14q>0?a14q:"Out of stock")+""
				+ "\n3.   Iphone   15       80,000     "+(a15q>0?a15q:"Out of stock")+"\n4.   Iphone   15 pro   1,30,000   "+(a15proq>0?a15proq:"Out of stock")+"\n5.   Exit()");
		System.out.println("Select a model which you want to buy in IPhone ");
		int iphonemodels=sc.nextInt(); 
		switch(iphonemodels) {
		case 1:
			System.out.println("enter the number of quantity  ");
			int a13qu=sc.nextInt();
			if(a13qu<=a13q) {
				a13q=a13q-a13qu;
				int res=a13qu*50000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+a13q);
				onePlus();
			}
			break;
		case 2:
			System.out.println("enter the number of quantity  ");
			int a14qu=sc.nextInt();
			if(a14qu<=a14q) {
				a14q=a14q-a14qu;
				int res=a14qu*60000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+a14q);
				onePlus();
			}
			break;
		case 3:
			System.out.println("enter the number of quantity  ");
			int a15qu=sc.nextInt();
			if(a15qu<=a15q) {
				a15q=a15q-a15qu;
				int res=a15qu*80000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+a15q);
				onePlus();
			}
			break;
		case 4:
			System.out.println("enter the number of quantity  ");
			int a15proqu=sc.nextInt();
			if(a15proqu<=a15proq) {
				a15proq=a15proq-a15proqu;
				int res=a15proqu*80000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+a15proq);
				onePlus();
			}
			break;
		case 5:
			mobiles();
			break;
			
		}
	}
	public void oppo(){
		
		System.out.println("\nsno. Brand    models     prices   quantity\n1.   Oppo     N3 Flip    95,000     "+(opN3q>0?opN3q:"Out of stock")+"\n2.   Oppo     N2 Flip    70,000     "+(opN2q>0?opN2q:"Out of stock")+""
				+ "\n3.   Oppo     Reno 10    30,000     "+(op10renoq>0?op10renoq:"Out of stock")+"\n4.   Oppo     A79        20,000     "+(opa79q>0?opa79q:"Out of stock")+"\n5.   Exit()");
		System.out.println("Select a model which you want to buy in Oppo ");
		int oppomodels=sc.nextInt(); 
		switch(oppomodels) {
		case 1:
			System.out.println("enter the number of quantity  ");
			int opN3qu=sc.nextInt();
			if(opN3qu<=opN3q) {
				opN3q=opN3q-opN3qu;
				int res=opN3qu*95000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+opN3q);
				oppo();
			}
			break;
		case 2:
			System.out.println("enter the number of quantity  ");
			int opN2qu=sc.nextInt();
			if(opN2qu<=opN2q) {
				opN2q=opN2q-opN2qu;
				int res=opN2qu*95000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+opN2q);
				oppo();
			}
			break;
		case 3:
			System.out.println("enter the number of quantity  ");
			int op10renoqu=sc.nextInt();
			if(op10renoqu<=op10renoq) {
				op10renoq=op10renoq-op10renoqu;
				int res=op10renoqu*95000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+op10renoq);
				oppo();
			}
			break;
		case 4:
			System.out.println("enter the number of quantity  ");
			int opa79qu=sc.nextInt();
			if(opa79qu<=opa79q) {
				opa79q=opa79q-opa79qu;
				int res=opa79qu*95000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+opa79q);
				oppo();
			}
			break;
		case 5:
			mobiles();
			break;
		}
		
	}
	public void nothing(){
		
		
		System.out.println("\nsno. Brand    models      prices   quantity\n1.   nothing  Phone(1)    25,000     "+(Np1q>0?Np1q:"Out of stock")+"\n2.   nothing  Phone(2)    40,000     "+(Np2q>0?Np2q:"Out of stock")+"\n3.   exit()");
		System.out.println("Select a model which you want to buy in Nothing ");
		int nothingmodels=sc.nextInt(); 
		switch(nothingmodels) {
		case 1:
			System.out.println("enter the number of quantity  ");
			int Np1qu=sc.nextInt();
			if(Np1qu<=Np1qu) {
				Np1q=Np1q-Np1qu;
				int res=Np1qu*25000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+Np1q);
				nothing();
			}
			break;
		case 2:
			System.out.println("enter the number of quantity  ");
			int Np2qu=sc.nextInt();
			if(Np2qu<=Np2qu) {
				Np2q=Np2q-Np2qu;
				int res=Np2qu*40000;
				bill(res);
			}
			else {
				System.out.println("we dont have that much of limit we have only "+Np2q);
				nothing();
			}
			break;
		case 3:
			mobiles();
			break;
		 default:
			System.out.println("enter a valid input from the below list ");
			nothing();
		}
	}

}
public class MobileMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobileBrands obj=new mobileBrands();
		Scanner sc=new Scanner(System.in);
		int mobilebrand;
		int result=0;
		System.out.println("WELCOME TO HYDRA MOBILES");
		System.out.println("");
		obj.partten();
		System.out.println("");
		while(true) {
			System.out.println("Choose a brand which u want to have");
			mobilebrand=obj.mobiles();
			switch(mobilebrand) {
			case 1:
				System.out.println("these are some of the models in Samsung");
				obj.Samsung();
				break;
			case 2:
				System.out.println("these are some of the models in Iphone");
				obj.iphone();
				break;
			case 3:
				System.out.println("these are some of the models in OnePlus");
				obj.onePlus();
				break;
			case 4:
				System.out.println("these are some of the models in Oppo");
				obj.oppo();
				break;
			case 5:
				System.out.println("these are some of the models in Nothing");
				obj.nothing();
				break;
			case 6:
				 result=1;
			}
			double discount_bill;
			if(result==1) {
				int total=obj.sum;
				 discount_bill=obj.discountbill(total);
				 obj.gstbill(discount_bill);
				
				break;
			}
			System.out.println("would you like to order any other items sir y/n");
			System.out.println("would you like to order any other items sir y/n");
			String dec1=sc.nextLine();
			if(dec1.equals("n")) {
				discount_bill=obj.discountbill(obj.sum);
				obj.gstbill(discount_bill);
				break;
			}
			
		}

	}

}
