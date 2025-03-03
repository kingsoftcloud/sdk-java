package ksyun.client.kkms.describekeys.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeKeysRequest
 * @Description 请求参数
 */
@Data
public class DescribeKeysRequest {
    /**
     * 客户主KEY的ID
     */
    @KsYunField(name = "KeyId")
    private List<String> KeyIdList;

}