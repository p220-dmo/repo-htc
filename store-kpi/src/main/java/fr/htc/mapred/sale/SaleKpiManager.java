package fr.htc.mapred.sale;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class SaleKpiManager {

	/**
	 * Mapper
	 * @author dmouchene
	 *
	 */
	public static class SaleMapper extends Mapper<LongWritable, Text, Text, Text> {

		
		protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			//Value represente une ligne CSV
			//implémeneter le methode map : identifier la clé et la valeur
			// clé : store id
			// value : le mot
			//value = stores_sale * sales_unit
			
			//trier le mot et le mettre le resultat dans : sortedWordKey
			
			//ajouter une pair (Key, Value) au contexte
			 context.write(null, null);
		}
	}

	/**
	 * Reducer
	 * @author dmouchene
	 *
	 */
	public static class SaleReducer extends Reducer<Text, Text, IntWritable, Text> {
		

		
		protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

		
		}

	}
	
	
	
	
	
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {

		Configuration conf = new Configuration();
		Job job = new Job(conf, "KPI Manager");

		job.setJarByClass(SaleKpiManager.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		job.setMapperClass(SaleMapper.class);
		job.setCombinerClass(SaleReducer.class);
		job.setReducerClass(SaleReducer.class);

		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);

		System.exit(job.waitForCompletion(true) ? 0 : 1);

	}

}