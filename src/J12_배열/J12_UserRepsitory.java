package J12_배열;

public class J12_UserRepsitory {

	private J12_User[] userTable;

	public J12_UserRepsitory(J12_User[] userTable) {

		this.userTable = userTable;
	}
	
	public J12_User[] getUserTable() {
		return userTable;
	}

	public void saveuser(J12_User user) {
		extendArrayOne();
		userTable[userTable.length - 1] = user;

	}
	
	public void extendArray(int length) { 
		J12_User[] newArray = new J12_User[userTable.length + length];
	}
	
	public void extendArrayOne() { 
		J12_User[] newArray = new J12_User[userTable.length + 1];
		transferDataToNewArray(userTable, newArray);
		userTable = newArray;
	}
	
	public void transferDataToNewArray(J12_User[] oldArray, J12_User[] newArray) {
		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		
	}

}
