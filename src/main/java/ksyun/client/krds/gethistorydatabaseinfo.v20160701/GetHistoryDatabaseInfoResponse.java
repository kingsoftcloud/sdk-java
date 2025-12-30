package ksyun.client.krds.gethistorydatabaseinfo.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetHistoryDatabaseInfoResponse
* @Description GetHistoryDatabaseInfo 返回体
*/
@Data
@ToString
public class GetHistoryDatabaseInfoResponse extends BaseResponseModel {

    /**-
*/
    @JsonProperty("Databases")
    private List<DatabasesDto> Databases;

    @Data
    @ToString
    public static class DatabasesDto {
        /**数据库名称
*/
        @JsonProperty("DatabaseName")
        private String DatabaseName;

        /**数据库表的数组	
*/
        @JsonProperty("TableNames")
        private List<String> TableNames;

    }

    /**请求id
*/
    @JsonProperty("RequestId")
    private String RequestId;

}
