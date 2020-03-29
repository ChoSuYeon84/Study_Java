import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Lotto {
	//컴포넌트 정의(선언)
	JFrame frame;
	JPanel panel;
	JTextArea output;
	JButton startbtn;
	JButton clearbtn;
	
	//생성자 메소드 : 코드구현
	public Lotto() {
		//컴포넌트 객체 생성
		frame = new JFrame();
		panel = new JPanel();
		output = new JTextArea();
		startbtn = new JButton("번호생성");
		clearbtn = new JButton("번호지우기");
		
		//startBtn 과  clearBtn 을 panel에 묶어준다.
		panel.add(startbtn);
		panel.add(clearbtn);
		
		//출력창(output)의 글꼴스타일 변경
		output.setFont(new Font("굴림", Font.BOLD, 15));
		
		//frame에 output과 panel을 배치
		frame.getContentPane().add(new JScrollPane(output), BorderLayout.CENTER);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		//frame 속성 설정
		frame.setTitle("Lotto Game!!!");
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//이벤트 처리를 위한 Listener와 연계
		startbtn.addActionListener(new StartBtnListener());
		clearbtn.addActionListener(new ClearBtnListener());
	}//Lotto()
	
	//번호생성
	class StartBtnListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Random random = new Random();	//랜덤객체 생성
			int[] lotto = new int[6];		//번호가 저장될 배열 생성
			
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = random.nextInt(45)+1;	//1~45 범위내의 번호를 할당
				for (int j = 0; j < i; j++) {		//번호 중복검사
					if(lotto[i] == lotto[j]) {
						i = i - 1; //i -= 1;
						break;
					}//if
				}//for j
			}//for i
			Arrays.sort(lotto);
			
			for (int i = 0; i < lotto.length; i++) {
				if(lotto[i] < 10) {
					output.append("0"+lotto[i] + " ");
				}else {
					output.append(lotto[i] + " ");
				}//if
			}//for
			output.append("\n");
		}//actionPerformed()
	}//class
	
	//번호 지우기
	class ClearBtnListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			output.setText("");
		}//actionPerformed()
	}//class
	
	public static void main(String[] args) {
		new Lotto();
	}//main();
}//class