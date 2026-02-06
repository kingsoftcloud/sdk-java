package ksyun.client.kpfs.getinodecount.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetInodeCountResponse
* @Description GetInodeCount 返回体
*/
@Data
@ToString
public class GetInodeCountResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**监控数据信息*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**时间戳。如：1732204800。*/
        @JsonProperty("Time")
        private Long Time;

        /**数据值，文件系统已用Inode数量随时间变化趋势，单位：个。返回null代表该时间点无数据。*/
        @JsonProperty("Value")
        private Long Value;

    }

}
