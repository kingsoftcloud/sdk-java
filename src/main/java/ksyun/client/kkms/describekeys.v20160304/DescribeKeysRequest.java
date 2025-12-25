package ksyun.client.kkms.describekeys.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKeysRequest
* @Description 请求参数
*/
@Data
public class DescribeKeysRequest{
    /**客户主KEY的ID*/
    @KsYunField(name = "KeyId", type = 1)
    private List<String> KeyIdList;

}
