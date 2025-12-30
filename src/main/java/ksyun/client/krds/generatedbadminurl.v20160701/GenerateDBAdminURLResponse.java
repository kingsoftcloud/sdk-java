package ksyun.client.krds.generatedbadminurl.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GenerateDBAdminURLResponse
* @Description GenerateDBAdminURL 返回体
*/
@Data
@ToString
public class GenerateDBAdminURLResponse extends BaseResponseModel {

    /**WEB登录地址
*/
    @JsonProperty("DBAdminURL")
    private String DBAdminURL;

    /**请求ID	
	–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
