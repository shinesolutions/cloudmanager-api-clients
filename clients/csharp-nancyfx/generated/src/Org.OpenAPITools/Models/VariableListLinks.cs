using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// VariableListLinks
    /// </summary>
    public sealed class VariableListLinks:  IEquatable<VariableListLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelEnvironment
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelEnvironment { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelProgram
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelProgram { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use VariableListLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public VariableListLinks()
        {
        }

        private VariableListLinks(HalLink HttpNsAdobeComAdobecloudRelEnvironment, HalLink HttpNsAdobeComAdobecloudRelProgram, HalLink Self)
        {
            
            this.HttpNsAdobeComAdobecloudRelEnvironment = HttpNsAdobeComAdobecloudRelEnvironment;
            
            this.HttpNsAdobeComAdobecloudRelProgram = HttpNsAdobeComAdobecloudRelProgram;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of VariableListLinks.
        /// </summary>
        /// <returns>VariableListLinksBuilder</returns>
        public static VariableListLinksBuilder Builder()
        {
            return new VariableListLinksBuilder();
        }

        /// <summary>
        /// Returns VariableListLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>VariableListLinksBuilder</returns>
        public VariableListLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelEnvironment(HttpNsAdobeComAdobecloudRelEnvironment)
                .HttpNsAdobeComAdobecloudRelProgram(HttpNsAdobeComAdobecloudRelProgram)
                .Self(Self);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(VariableListLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (VariableListLinks.
        /// </summary>
        /// <param name="left">Compared (VariableListLinks</param>
        /// <param name="right">Compared (VariableListLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (VariableListLinks left, VariableListLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (VariableListLinks.
        /// </summary>
        /// <param name="left">Compared (VariableListLinks</param>
        /// <param name="right">Compared (VariableListLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (VariableListLinks left, VariableListLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of VariableListLinks.
        /// </summary>
        public sealed class VariableListLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelEnvironment;
            private HalLink _HttpNsAdobeComAdobecloudRelProgram;
            private HalLink _Self;

            internal VariableListLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for VariableListLinks.HttpNsAdobeComAdobecloudRelEnvironment property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelEnvironment</param>
            public VariableListLinksBuilder HttpNsAdobeComAdobecloudRelEnvironment(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelEnvironment = value;
                return this;
            }

            /// <summary>
            /// Sets value for VariableListLinks.HttpNsAdobeComAdobecloudRelProgram property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelProgram</param>
            public VariableListLinksBuilder HttpNsAdobeComAdobecloudRelProgram(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelProgram = value;
                return this;
            }

            /// <summary>
            /// Sets value for VariableListLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public VariableListLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of VariableListLinks.
            /// </summary>
            /// <returns>VariableListLinks</returns>
            public VariableListLinks Build()
            {
                Validate();
                return new VariableListLinks(
                    HttpNsAdobeComAdobecloudRelEnvironment: _HttpNsAdobeComAdobecloudRelEnvironment,
                    HttpNsAdobeComAdobecloudRelProgram: _HttpNsAdobeComAdobecloudRelProgram,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}