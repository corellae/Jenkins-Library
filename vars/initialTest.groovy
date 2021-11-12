def call(){
  def paramString = ""
  paramString += (env.app_name) ? "-Dapp.name=${env.app_name} " : ''
  
  paramString
}
