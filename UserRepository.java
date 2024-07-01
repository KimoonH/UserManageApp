package demo12;

import java.util.ArrayList;
import java.util.List;

/*
 * - 저장소 기능 구현
 * - save
 * 	 find
 * 	 update
 *   delete 기능 구현
 */
public class UserRepository {
	private List<User> db = new ArrayList<User>();
	
	/**
	 * 모든 사용자정보를 반환한다.
	 * @return 모든 사용자정보가 저장된 List객체
	 */
	public List<User> findAll() {
		return db;
	}
	
	/**
	 * 신규 사용자정보를 전달받아서 콜렉션(리스트객체)에 저장한다.
	 * @param user 신규 사용자 정보
	 */
	public void save(User user) {
		db.add(user);
	}
	
	/**
	 * 아이디를 전달받아서 콜렉션에서 사용자와 아이디와 일치하는 사용자 정보를 찾아서 반환한다.
	 * @param id 조회할 사용자 아이디
	 * @return 저장된 사용자 정보, 일치하는 사용자정보가 없으면 null을 반환한다.
	 */
	public User findUserById(String id) {
		User foundUser = null;
		for(User user : db) {
			if(user.getId().equals(id)) {
				foundUser = user;
				break;
			}
		} 
		return foundUser;
	}
}
