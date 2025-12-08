package ksyun.client.knad.getblocklocations.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetBlockLocationsResponse
* @Description GetBlockLocations 返回体
*/
@Data
@ToString
public class GetBlockLocationsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否封禁。
1封禁 0 不封禁*/
    @JsonProperty("LocationBlock")
    private Integer LocationBlock;

    /***/
    @JsonProperty("BlockLocationSet")
    private List<BlockLocationSetDto> BlockLocationSet;

    @Data
    @ToString
    public static class BlockLocationSetDto {
        /***/
        @JsonProperty("ZoneKey")
        private String ZoneKey;

        /***/
        @JsonProperty("ZoneName")
        private String ZoneName;

    }

}
