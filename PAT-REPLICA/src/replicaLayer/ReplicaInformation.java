package replicaLayer;

import java.util.Collection;
import java.util.HashMap;

public class ReplicaInformation {
	
	private HashMap<String,String> networkInfoList;
	private int sequencerPort;
	private int frontEndPort;
	private int replicaManagerPort;
	private int heartbeatListener1ReplicaPort;
	private int heartbeatListener2ReplicaPort;
	private int multicastPort;
	private String sequencerIp;
	private String frontEndIp;
	private String replicaManagerIp;
	private String heartbeatListenerIp;
	private String multicastAddr;
	
	
	
	public ReplicaInformation(){
		networkInfoList = new HashMap<String,String>();
		networkInfoList.put("replica1", "7777-132.205.95.190");
		networkInfoList.put("replica2", "7778-132.205.95.189");
		networkInfoList.put("replica3", "7779-132.205.95.191");
		//sequencerPort = 7780;
		frontEndPort = 2021;
		replicaManagerPort = 7782;
		heartbeatListener1ReplicaPort = 7783;
		heartbeatListener2ReplicaPort = 7784;
		//sequencerIp = "132.205.95.191"; //should be the same as replica3 ip
		frontEndIp = "132.205.95.189"; //should be the same as replica2 ip
		replicaManagerIp = "132.205.95.190"; //should be the same as replica1 ip
		heartbeatListenerIp = "132.205.95.190";  //should be the same as your replica ip
		multicastPort = 5000;
		multicastAddr = "224.24.24.24";
	}
	
	//get the port of a specific port
	public int getReplicaPort(String replicaName){
		String networkInfo = networkInfoList.get(replicaName);
		String[] parts = networkInfo.split("-");
		int port = 0;
		try
		{
			port = Integer.parseInt(parts[0]);
			return port;
		}
		catch(NumberFormatException e) {}
		
		return port;
	}
	
	//get the port of a specific port
	public String getReplicaIp(String replicaName){
		String networkInfo = networkInfoList.get(replicaName);
		String[] parts = networkInfo.split("-");
		
		return parts[1];
	}
	
	public boolean isReplicaNameValid(String replicaName){
		return networkInfoList.containsKey(replicaName);
	}
	
	//get a collection of all servers ports
	public Collection<String> getReplicaName(){
		return networkInfoList.keySet();
	}
	
	public int getSequencerPort()
	{
		return sequencerPort;
	}
	
	public String getSequencerIp()
	{
		return sequencerIp;
	}

	public int getFrontEndPort() {
		return frontEndPort;
	}

	public int getReplicaManagerPort() {
		return replicaManagerPort;
	}

	public String getFrontEndIp() {
		return frontEndIp;
	}


	public String getReplicaManagerIp() {
		return replicaManagerIp;
	}

	public String getHeartbeatListenerIp() {
		return heartbeatListenerIp;
	}

	public int getMulticastPort() {
		return multicastPort;
	}

	public void setMulticastPort(int multicastPort) {
		this.multicastPort = multicastPort;
	}

	public String getMulticastAddr() {
		return multicastAddr;
	}

	public void setMulticastAddr(String multicastAddr) {
		this.multicastAddr = multicastAddr;
	}

	public int getHeartbeatListener1ReplicaPort() {
		return heartbeatListener1ReplicaPort;
	}

	public void setHeartbeatListener1ReplicaPort(
			int heartbeatListener1ReplicaPort) {
		this.heartbeatListener1ReplicaPort = heartbeatListener1ReplicaPort;
	}

	public int getHeartbeatListener2ReplicaPort() {
		return heartbeatListener2ReplicaPort;
	}

	public void setHeartbeatListener2ReplicaPort(
			int heartbeatListener2ReplicaPort) {
		this.heartbeatListener2ReplicaPort = heartbeatListener2ReplicaPort;
	}
	

}
