package ksyun.client.kpfs.describesubdirlist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSubDirListResponse
* @Description DescribeSubDirList 返回体
*/
@Data
@ToString
public class DescribeSubDirListResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**子目录总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**目录数据列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**子目录名称*/
        @JsonProperty("Name")
        private String Name;

        /**目录最后修改时间戳*/
        @JsonProperty("UpdateTime")
        private Long UpdateTime;

    }

}
