package cn.tedu.object;

public class LianXiDemo1 {
	public static void main(String[] args) {
		
		Controller mp1 = new Controller(new DVDPlayer());
		Controller mp2 = new Controller(new CDPlayer());
		Controller mp3 = new Controller(new TapePlayer());
		mp1.play(0);
		mp1.stop(0);
		mp1.open(0);
		mp2.play(1);
		mp2.stop(1);
		mp2.open(1);
		mp3.play(2);
		mp3.stop(2);
		mp3.open(2);
	}

}
//定义接口 MediaPlayer
interface MediaPlayer{
	//播放
	public void play();
	//停止
	public void stop();
	//开仓
	public void open();
}
//DVDPlayer这个类实现MediaPlayer这个接口
class DVDPlayer implements MediaPlayer{
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVD播放器已播放");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DVD播放器已停止");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("DVD播放器已开仓");
	}
	
}
class CDPlayer implements MediaPlayer{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD播放器已播放");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD播放器已停止");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("CD播放器已开仓");
	}
	
}
class TapePlayer implements MediaPlayer{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("录音机已播放");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("录音机已停止");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("录音机已开仓");
	}
	
}
class Controller{
	private MediaPlayer[] players ;
	
	public MediaPlayer[] getPlayers() {
		return players;
	}
	public void setPlayers(MediaPlayer[] players) {
		this.players = players;
	}
	
	static int i = 0;
		
	
	//构造方法中初始化players数组
	public Controller(MediaPlayer mediaplayer){
		this.setPlayers(new MediaPlayer[3]);
		
		this.players[i++] = mediaplayer; 
	}
	//对相应的设备调用play方法
	public void play(int i){
		players[i].play();
		
	}
	//stop
	public void stop(int i){
		players[i].stop();
	}
	//open
	public void open(int i){
		players[i].open();
	}
	
	
}