import jenkins.model.Jenkins

public static void checkJob(){
  println(System.getEnv())
  println('$JOB_NAME')
}
