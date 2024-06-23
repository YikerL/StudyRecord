//多重循环练习

import java.util.Scanner;

public class MultForExercise01 {
	
	public static void main(String[] args) {
   
		//三个班，每班五名同学，求各班平均分和年级平均分
		//统计三个班及格人数
		//
		//(1)int class , int student , double score
		//(2)scanner
		int team;
		int student;
		double average;//平均分
		double sum = 0;
		double sum3 = 0;
		int count = 0;
		Scanner myscanner = new Scanner(System.in);
		for(team = 1 ; team <= 3 ; team++ ) {
			for (student = 1 ; student <= 5 ; student++ ) {
				System.out.println("请输入第" + team + "个班第" + student + "个学生的成绩");
				double score = myscanner.nextDouble();
				sum =  sum + score;
				if(score >= 60) {
					count++;
				}
			}
			average = sum / 5;
			System.out.println(team + "班平均分为" + average);
			sum3 = sum3 + sum;
			sum = 0;
		}
		average = sum3 / 15;		
		System.out.println("三个班平均分为" + average);
		System.out.println("三个班及格人数为" + count);
	}
}