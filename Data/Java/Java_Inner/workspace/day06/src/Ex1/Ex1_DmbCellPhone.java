package Ex1;

public class Ex1_DmbCellPhone extends Ex1_CellPhone {
	
	//필드
	private int channel;
	
	
	public int getChannel() {
		return channel;
	}

public void setChannel(int channel) {
	this.channel = channel;
}
	//생성자
	Ex1_DmbCellPhone(String setModel, String setColor, int setChannel){	
	
		this.setModel(setModel);
		this.setColor(setColor);
		//this.channel = getChannel;
		this.setChannel(setChannel);
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	


}
