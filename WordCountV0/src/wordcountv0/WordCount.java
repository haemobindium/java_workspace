package wordcountv0;

import java.io.IOException;


import java.util.*;
import org.apache.hadoop.mapreduce.Job;        
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class WordCount extends Configured implements Tool {
public static class TokenizerMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	private final static IntWritable one = new IntWritable(1);
	private Text word = new Text();
	public void map(LongWritable key, Text value, Context context )
	throws IOException, InterruptedException {
	StringTokenizer itr = new StringTokenizer(value.toString()); //split text into words
	while (itr.hasMoreTokens()) {
	word.set(itr.nextToken());
	context.write(word, one);
	}
	}
}
public static class IntSumReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	private IntWritable result = new IntWritable();
	public void reduce(Text key, Iterable<IntWritable> values, Context context )
	throws IOException, InterruptedException {
	int sum = 0;
	for (IntWritable val : values)
	{ 
		sum = val.get(); 
	}
	result.set(sum);
	
	context.write(key, result); //Context object used to write output
}
}
public static void main(String[] args) throws Exception {
	int res = ToolRunner.run(new Configuration(),  new WordCount(),args);
	 System.exit(res);
	 }
	@Override
	 public int run(String[] args) throws Exception {
		Configuration conf = new Configuration();
         String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
         if (otherArgs.length != 2) {
          System.err.println("Usage: wordcount <in> <out>");
           System.exit(2);
         }
	 /*if (args.length != 2) {
	 System.out.println("usage: [input] [output]");
	 System.exit(-1);
	 }*/
	//Job job = Job.getInstance(conf);
         long startTime = System.currentTimeMillis();
	 Job job = new Job(conf, "Job1");
	 job.setOutputKeyClass(Text.class);
	 job.setOutputValueClass(IntWritable.class);
	 job.setMapperClass(TokenizerMapper.class);
	// job.setReducerClass(IntSumReducer.class);
	 job.setInputFormatClass(TextInputFormat.class);
	 job.setOutputFormatClass(TextOutputFormat.class);
	 FileInputFormat.addInputPath( job, new Path(otherArgs[0]));
	 //FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
	 //FileInputFormat.setInputPaths(job, new Path(otherArgs[0]));
	 FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
	 job.setJarByClass(WordCount.class);
	 job.submit();
	 long endTime   = System.currentTimeMillis();
     long totalTime = endTime - startTime;
     System.out.println(totalTime);
     System.exit(job.waitForCompletion(true)?0:1);
	 return 0;
	 } 
}