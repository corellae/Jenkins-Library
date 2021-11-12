def call(){
  def paramString = ""
  paramString += (env.app.name) ? "-Dapp_name=${env.app.name} " : ''
  
  paramString
}
