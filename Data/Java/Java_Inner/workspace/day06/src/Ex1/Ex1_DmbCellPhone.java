package Ex1;

public class Ex1_DmbCellPhone extends Ex1_CellPhone {
	
	//�ʵ�
	private int channel;
	
	
	public int getChannel() {
		return channel;
	}

public void setChannel(int channel) {
	this.channel = channel;
}
	//������
	Ex1_DmbCellPhone(String setModel, String setColor, int setChannel){	
	
		this.setModel(setModel);
		this.setColor(setColor);
		//this.channel = getChannel;
		this.setChannel(setChannel);
	}
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	


}
