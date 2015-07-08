package day03lianxi;

public class person {

	
	
		String name;
		String sex;
		int lg;
		void person01(String n,String s,int h){
			name=n;
			sex=s;
			lg=h;
		}
		void introduce(){
			System.out.println("你好");
		}
		/**
		 * @param args
		 */
		public void main(String[] args) {
			// TODO Auto-generated method stub
			person li=new person();
			System.out.println("姓名："+li.name);
			System.out.println("性别："+li.sex);
			System.out.println("身高："+li.lg+"cm");
			li.introduce();
		}
	}
	