package ksyun.client.knad.disassociateip.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisassociateIpResponse
* @Description DisassociateIp 返回体
*/
@Data
@ToString
public class DisassociateIpResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DeletedEipSet")
    private List<DeletedEipSetDto> DeletedEipSet;

    @Data
    @ToString
    public static class DeletedEipSetDto {
        /***/
        @JsonProperty("KnadId")
        private String KnadId;

        /***/
        @JsonProperty("OldIpCount")
        private Integer OldIpCount;

        /***/
        @JsonProperty("IpCount")
        private Integer IpCount;

        /***/
        @JsonProperty("Return")
        private Boolean ReturnField;

    }

}
