package ksyun.client.mongodb.updatemongodbinstancecluster.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateMongoDBInstanceClusterResponse
 * @Description UpdateMongoDBInstanceCluster 返回体
 */
@Data
@ToString
public class UpdateMongoDBInstanceClusterResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
