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
			System.out.println("���");
		}
		/**
		 * @param args
		 */
		public void main(String[] args) {
			// TODO Auto-generated method stub
			person li=new person();
			System.out.println("������"+li.name);
			System.out.println("�Ա�"+li.sex);
			System.out.println("��ߣ�"+li.lg+"cm");
			li.introduce();
		}
	}
	