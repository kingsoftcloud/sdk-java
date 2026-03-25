package ksyun.client.aicp.getqueuemember.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetQueueMemberResponse
* @Description GetQueueMember 返回体
*/
@Data
@ToString
public class GetQueueMemberResponse extends BaseResponseModel {

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Page")
    private Integer Page;

    /***/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**成员资源占用信息列表*/
    @JsonProperty("Users")
    private List<UsersDto> Users;

    @Data
    @ToString
    public static class UsersDto {
        /**子账号ID*/
        @JsonProperty("UserId")
        private String UserId;

        /**此成员权限Code
admin - 创建者/主账号
global_admin - 全局管理员
writer - 队列管理员
reader - 队列成员
*/
        @JsonProperty("Permission")
        private String Permission;

        /**所占用GPU卡数*/
        @JsonProperty("GPUAllocated")
        private String GPUAllocated;

        /**队列创建者标识。若为true表示此成员是队列创建者。*/
        @JsonProperty("IsCreator")
        private Boolean IsCreator;

        /**成员占用CPU核数*/
        @JsonProperty("CPUAllocated")
        private Integer CPUAllocated;

        /**成员所占用内存大小。单位Gi*/
        @JsonProperty("MemoryAllocated")
        private Integer MemoryAllocated;

    }

    /**接口调用者用户权限Code
admin - 创建者/主账号
global_admin - 全局管理员
writer - 队列管理员
reader - 队列成员*/
    @JsonProperty("CurrentUserPermission")
    private String CurrentUserPermission;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
