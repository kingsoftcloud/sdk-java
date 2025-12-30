package ksyun.client.waf.modifystoragetime.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyStorageTimeResponse
* @Description ModifyStorageTime 返回体
*/
@Data
@ToString
public class ModifyStorageTimeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("StorageTime")
    private Integer StorageTime;

}
