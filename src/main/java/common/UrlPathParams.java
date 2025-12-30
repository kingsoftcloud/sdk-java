package common;

/**
 * URL 路径参数类
 * 用于在 URL query 中传递特定的路径参数
 *
 * 支持的参数：
 * - AccountId: 账户 ID
 * - UserId: 用户 ID
 * - RoleId: 角色 ID
 *
 * @author SDK Generator
 * @version 1.0
 */
public class UrlPathParams {

    /**
     * 账户 ID
     */
    private String accountId;

    /**
     * 用户 ID
     */
    private String userId;

    /**
     * 角色 ID
     */
    private String roleId;

    public UrlPathParams() {
    }

    public UrlPathParams(String accountId, String userId, String roleId) {
        this.accountId = accountId;
        this.userId = userId;
        this.roleId = roleId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 检查是否有任何参数被设置
     * @return true 如果至少有一个参数不为空
     */
    public boolean hasParams() {
        return accountId != null || userId != null || roleId != null;
    }

    @Override
    public String toString() {
        return "UrlPathParams{" +
                "accountId='" + accountId + '\'' +
                ", userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
