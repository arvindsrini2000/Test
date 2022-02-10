import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.StructType;


public class Testclass 
{
	
	public static void main(String[] args)
	{
	SparkConf conf = new SparkConf().setAppName("Line_Count");
	JavaSparkContext ctx = new JavaSparkContext(conf);
	JavaRDD<String> textLoadRDD = ctx.textFile("/home/local/ZOHOCORP/arvind-pt4542/Documents/hadoop-3.3.1/README.txt");
	System.out.println(textLoadRDD.count());
	/*	SparkSession spark = SparkSession.builder().appName("Java Spark SQL Example").getOrCreate();
	StructType schema = new StructType().add("department", "string")
			.add("designation", "string");
	Dataset<Row> df = spark.read().option("mode", "DROPMALFORMED").schema(schema).csv("/home/local/ZOHOCORP/arvind-pt4542/Downloads/Test1 - Sheet1 (1).csv");
	*/
	}
}
