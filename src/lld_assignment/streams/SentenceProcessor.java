package lld_assignment.streams;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SentenceProcessor {
    public static int processSentences(List<String> sentences) {
        //code here

        int avg=0;
        Map<Integer,String> map = sentences.stream().filter(x->x.contains("Java")).collect(Collectors.groupingBy(x->x.length(),Collectors.joining()));
        System.out.println(map);

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            avg+=entry.getKey();
        }
        if(map.size()==0){
            return 0;
        }
        return avg/ map.size();
    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is a programming language.",
                "Python is also a good language.",
                "Java stream processing is powerful.",
                "C++ is not as popular as Java."
        );

        int averageLength = SentenceProcessor.processSentences(sentences);
        System.out.println(averageLength);

        sentences = Arrays.asList(
                "Python is a programming language.",
                "JS is used for web development.",
                "Ruby is known for its simplicity.",
                "java is good"
        );

        averageLength = SentenceProcessor.processSentences(sentences);
        System.out.println(averageLength);
    }
}