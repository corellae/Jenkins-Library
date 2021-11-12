def call(){
  def paramString = ""
  paramString += (env.app_name) ? "-Dapp_name=${env.app_name} " : ''
  
  paramString
}
