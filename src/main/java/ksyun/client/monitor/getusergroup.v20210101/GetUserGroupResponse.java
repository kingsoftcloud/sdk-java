package ksyun.client.monitor.getusergroup.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetUserGroupResponse
* @Description GetUserGroup 返回体
*/
@Data
@ToString
public class GetUserGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**联系组列表*/
        @JsonProperty("userGrpList")
        private List<UserGrpListDto> UserGrpList;

        @Data
        @ToString
        public static class UserGrpListDto {
            /**联系组ID*/
            @JsonProperty("userGrpId")
            private Integer UserGrpId;

            /**联系组名称*/
            @JsonProperty("name")
            private String Name;

            /**组内联系人数量。*/
            @JsonProperty("userCount")
            private Integer UserCount;

        }

    }

    /**总记录数*/
    @JsonProperty("totalCount")
    private Integer TotalCount;

    /**请求ID。*/
    @JsonProperty("requestId")
    private String RequestId;

}
