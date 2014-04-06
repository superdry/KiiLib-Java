package jp.fkmsoft.libs.kiilib.apis;

import jp.fkmsoft.libs.kiilib.entities.KiiBaseUser;

/**
 * Provides User related APIs. To get this instance, Please call {@link AppAPI#userAPI()}
 * @author fkm
 *
 */
public interface UserAPI<T extends KiiBaseUser> {
    public interface UserCallback<U extends KiiBaseUser> extends KiiCallback {
        void onSuccess(U user);
    }
    
    void findUserByUsername(String username, UserCallback<T> callback);
    
    void findUserByEmail(String email, UserCallback<T> callback);
    
    void findUserByPhone(String phone, UserCallback<T> callback);
    
    void updateEmail(T user, String newEmail, boolean verified, UserCallback<T> callback);
    
    void updatePhone(T user, String newPhone, boolean verified, UserCallback<T> callback);
    
    void installDevice(String regId, UserCallback<T> callback);
}
