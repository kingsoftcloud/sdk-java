package ksyun.client.kec.deletedataguardgroups.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDataGuardGroupsResponse
* @Description DeleteDataGuardGroups 返回体
*/
@Data
@ToString
public class DeleteDataGuardGroupsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReturnSet")
    private List<ReturnSetDto> ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /***/
        @JsonProperty("DataGuardId")
        private String DataGuardId;

        /***/
        @JsonProperty("Return")
        private Boolean ReturnField;

    }

}
