package ksyun.client.krds.deletedbinstance.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDBInstanceResponse
* @Description DeleteDBInstance 返回体
*/
@Data
@ToString
public class DeleteDBInstanceResponse extends BaseResponseModel {

    /**请求ID
 */
    @JsonProperty("RequestId")
    private String RequestId;

}
