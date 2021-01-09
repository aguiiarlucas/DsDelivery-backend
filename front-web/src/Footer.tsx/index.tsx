import './styles.css'
import { ReactComponent as YoutubeIcon  } from './youtube.svg'; /*importando icone do Youtube*/
import { ReactComponent as LinkedInIcon  } from './linkedin.svg';/*importando icone do LinkedIn*/
import { ReactComponent as InstagramIcon  } from './instagram.svg';/*importando icone do Instagram*/

function Footer() {
    return (
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="https://www.youtube.com/c/DevSuperior" target="_new"> 
                <YoutubeIcon/>
                </a>

                <a href="https://www.linkedin.com/school/devsuperior/"target="_new">
                <LinkedInIcon/>
                </a>
                
                <a href="https://www.instagram.com/devsuperior.ig/"target="_new">
                <InstagramIcon/>
                </a>

               
            </div>

        </footer>
    )



}

export default Footer;