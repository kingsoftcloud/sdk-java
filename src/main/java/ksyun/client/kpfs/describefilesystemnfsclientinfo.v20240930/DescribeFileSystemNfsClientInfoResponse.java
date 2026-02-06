package ksyun.client.kpfs.describefilesystemnfsclientinfo.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFileSystemNfsClientInfoResponse
* @Description DescribeFileSystemNfsClientInfo 返回体
*/
@Data
@ToString
public class DescribeFileSystemNfsClientInfoResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**VpcIp列表。*/
    @JsonProperty("Data")
    private List<String> Data;

    /**页码。*/
    @JsonProperty("PageNum")
    private Long PageNum;

    /**分页大小。*/
    @JsonProperty("PageSize")
    private Long PageSize;

    /**总数*/
    @JsonProperty("TotalCount")
    private Long TotalCount;

}
