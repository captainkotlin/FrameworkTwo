function fn() {
  var env = karate.env; // get java system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev'; // a custom 'intelligent' default
  }
  var config = {
    gorestUrlBase: 'https://gorest.co.in/public-api/',
    gorestBearer: '491bc842c82b98e2239c673393caef33d6a895bf9233ddedc2327a78274575fe',
    reqresUrlBase: 'https://reqres.in/api/'

  };

  karate.configure('logPrettyRequest', true);
  karate.configure('logPrettyResponse', true);
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  karate.configure('report', { showLog: true, showAllSteps: false });

  var LM = Java.type('utils.CustomLogModifier');
  karate.configure('logModifier', new LM())

  return config;
}