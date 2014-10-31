import groovy.json.JsonSlurper;
def json = new JsonSlurper().parseText(System.getenv()['VCAP_APPLICATION']);
println json[args[0]]